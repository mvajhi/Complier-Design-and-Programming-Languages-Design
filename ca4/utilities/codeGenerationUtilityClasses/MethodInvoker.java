import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MethodInvoker {
    private static final List<Object> objects = new ArrayList<>();
    private static final String KEY_OBS = "_msgObs_";

    public static void invokeMethod(Object x, String methodName, Object... args) {
        try {
            Class<?> clazz = x.getClass();
            Method method = findCompatibleMethod(clazz, methodName, args);

            if (method != null) {
                method.invoke(x, args);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Method findCompatibleMethod(Class<?> clazz, String methodName, Object... args) {
        for (Method method : clazz.getMethods()) {
            if (method.getName().equals(methodName) && isCompatible(method.getParameterTypes(), args)) {
                return method;
            }
        }
        return null;
    }

    private static boolean isCompatible(Class<?>[] paramTypes, Object[] args) {
        if (paramTypes.length != args.length) return false;

        for (int i = 0; i < paramTypes.length; i++) {
            if (!paramTypes[i].isAssignableFrom(args[i].getClass())) {
                return false;
            }
        }
        return true;
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

