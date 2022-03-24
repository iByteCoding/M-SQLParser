package org.ibyte.sql.parser.binder.accessor;

import org.ibyte.sql.parser.binder.annotation.NonNull;
import org.ibyte.sql.parser.binder.exception.IllegalValueException;
import org.ibyte.sql.parser.binder.util.Numbers;

/**
 * String 拓展访问器
 * <p>
 * 适配各类型读取，包含常用基础类型以及封装类型
 *
 * @param <K> key
 * @param <T> value
 */
public abstract class StringAccessor<K, T> implements Accessor<K, T> {

    private T t;

    @Override
    public void setTarget(@NonNull T target) {
        this.t = target;
    }

    @Override
    public T getTarget() {
        return t;
    }

    @Override
    public abstract Object get(K key);

    @Override
    public String getString(K key) {
        return getString(key, null);
    }

    @Override
    public abstract String getString(K key, String defaultValue);

    @Override
    public Character getCharacter(K key) {
        return getCharacter(key, null);
    }

    @Override
    public Character getCharacter(K key, Character defaultValue) {
        String value = getString(key);
        if (value == null) {
            return defaultValue;
        }
        if (value.length() != 1) {
            throw new IllegalValueException("'" + value + "' is a string not a character");
        }
        return value.charAt(0);
    }

    @Override
    public Byte getByte(K key) {
        return getByte(key, null);
    }

    @Override
    public Byte getByte(K key, Byte defaultValue) {
        String value = getString(key);
        if (value == null) {
            return defaultValue;
        }
        return getNumber(value).byteValue();
    }

    protected Number getNumber(String string) {
        return Numbers.createNumber(string);
    }

    @Override
    public Integer getInteger(K key) {
        return getInteger(key, null);
    }

    @Override
    public Integer getInteger(K key, Integer defaultValue) {
        String value = getString(key);
        if (value == null) {
            return defaultValue;
        }
        return getNumber(value).intValue();
    }

    @Override
    public Short getShort(K key) {
        return getShort(key, null);
    }

    @Override
    public Short getShort(K key, Short defaultValue) {
        String value = getString(key);
        if (value == null) {
            return defaultValue;
        }
        return getNumber(value).shortValue();
    }

    @Override
    public Double getDouble(K key) {
        return getDouble(key, null);
    }

    @Override
    public Double getDouble(K key, Double defaultValue) {
        String value = getString(key);
        if (value == null) {
            return defaultValue;
        }
        return getNumber(value).doubleValue();
    }

    @Override
    public Float getFloat(K key) {
        return getFloat(key, null);
    }

    @Override
    public Float getFloat(K key, Float defaultValue) {
        String value = getString(key);
        if (value == null) {
            return defaultValue;
        }
        return getNumber(value).floatValue();
    }

    @Override
    public Long getLong(K key) {
        return getLong(key, null);
    }

    @Override
    public Long getLong(K key, Long defaultValue) {
        String value = getString(key);
        if (value == null) {
            return defaultValue;
        }
        return getNumber(value).longValue();
    }

    @Override
    public Boolean getBoolean(K key) {
        return getBoolean(key, null);
    }

    @Override
    public Boolean getBoolean(K key, Boolean defaultValue) {
        String value = getString(key);
        if (value == null) {
            return defaultValue;
        }
        return Boolean.parseBoolean(value);
    }

    @Override
    public abstract void set(K key, Object value);

    @Override
    public void setString(K key, String value) {
        set(key, value);
    }

    @Override
    public void setByte(K key, byte value) {
        set(key, value);
    }

    @Override
    public void setShort(K key, short value) {
        set(key, value);
    }

    @Override
    public void setInteger(K key, int value) {
        set(key, value);
    }

    @Override
    public void setLong(K key, long value) {
        set(key, value);
    }

    @Override
    public void setFloat(K key, float value) {
        set(key, value);
    }

    @Override
    public void setDouble(K key, double value) {
        set(key, value);
    }

    @Override
    public void setBoolean(K key, boolean value) {
        set(key, value);
    }

    @Override
    public void setChar(K key, char value) {
        set(key, value);
    }
}

