package by.belstu.it.kovalchuk.basejava;

public class WrapperString {
    private String _string;

    public WrapperString() {
    }

    public WrapperString(String _string) {
        this._string = _string;
    }

    public String get_string() {
        return _string;
    }

    public void set_string(String _string) {
        this._string = _string;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "_string='" + _string + '\'' +
                '}';
    }

    public void replcae (String old, String newstr)
    {
        _string.replace(old,newstr);
    }
}
