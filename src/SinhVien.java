public class SinhVien extends Nguoi{
    private int Diem;
public SinhVien(){}
    public SinhVien(String ma, String ten, int tuoi, int diem) {
        super(ma, ten, tuoi);
        this.Diem = diem;
    }

    public int getDiem() {
        return Diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "Diem=" + Diem +
                '}';
    }

    public void setDiem(int diem) {
        Diem = diem;

    }
}
