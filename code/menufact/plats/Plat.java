package menufact.plats;

interface Plat{

    @Override
    public String toString();
    public int getCode();

    public void setCode(int code);

    public String getDescription();

    public void setDescription(String description);

    public double getPrix();

    public void setPrix(double prix);
}