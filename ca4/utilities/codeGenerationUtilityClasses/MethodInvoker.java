import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MethodInvoker {
    private static final List<Object> objects = new ArrayList<>();
    private static final String KEY_OBS = "_msgObs_";

    public static void invokeMethod(Object x, String methodName, Object... args) {
        try {
            Class<?> clazz = x.getClass();
            Class<?>[] paramTypes = new Class<?>[args.length];

            for (int i = 0; i < args.length; i++) {
                paramTypes[i] = args[i].getClass();
            }

            Method method = clazz.getMethod(methodName, paramTypes);
            method.invoke(x, args);
        } catch (NoSuchMethodException e) {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void addObject(Object obj) {
        objects.add(obj);
    }

    public static void invokeMethodPrivate(Object rcv, Object obs1, Object obs2, String methodName, Object... args) {
        invokeMethod(rcv, methodName, args);

        invokeMethod(obs1, KEY_OBS + methodName, args);
        invokeMethod(obs2, KEY_OBS + methodName, args);
    }

    public static void invokeMethodPublic(Object rcv, Object obs1, Object obs2, String methodName, Object... args) {
        invokeMethod(rcv, methodName, args);

        for (Object obj : objects) {
            if (!(obj == obs1 || obj == obs2)) {
                invokeMethod(obj, KEY_OBS + methodName, args);
            }
        }
    }
}

