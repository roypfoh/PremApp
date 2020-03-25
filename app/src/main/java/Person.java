public class Person {
    //Personal info
    private String name;
    private String store;

    //Sales Stats
    private int ppv = 0;
    private int tv = 0;
    private int up = 0;
    private int strategic = 0;
    private int cru = 0;
    private int protection = 0;
    private float extraPpv = 0;
    private float extraUp = 0;

    public Person() {
        name = null;
        store = null;
    }

    void setName(String a)
    {
        name = a;
    }

    void setStore(String a)
    {
        store = a;
    }
    void setPpv(int a)
    {
        ppv = a;
    }

    void setTv(int a)
    {
        tv = a;
    }
    void setUps(int a)
    {
        up = a;
    }
    void setStrategic(int a)
    {
        strategic = a;
    }

    void setCru(int a)
    {
        cru = a;
    }

    void setProtection(int a)
    {
        protection = a;
    }

    void setExtraPpv(float a)
    {
        extraPpv = a;
    }
    void setExtraUp(float a)
    {
        extraUp = a;
    }

    public String getName()
    {
        return name;
    }

    public String getStore()
    {
        return store;
    }

    public int getPpv()
    {
        return ppv;
    }

    public int getTv()
    {
        return tv;
    }

    public int getUp()
    {
        return up;
    }

    public int getStrategic()
    {
        return strategic;
    }

    public int getCru()
    {
        return cru;
    }

    public int getProtection()
    {
        return protection;
    }

    public float getExtraPpv()
    {
        return extraPpv;
    }

    public float getExtraUp()
    {
        return extraUp;
    }



}


