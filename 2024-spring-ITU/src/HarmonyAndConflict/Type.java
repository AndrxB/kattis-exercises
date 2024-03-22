package HarmonyAndConflict;

import java.util.Map;

public enum Type {
    HARMONY(1),
    CONFLICT(0);
    private int value;
    private Type(int value){
        this.value = value;
    }
    public static Map<Integer, Type> map;
    public static Type getType(int value){
        return map.get(value);
    }
}
