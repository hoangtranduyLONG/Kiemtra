public class QuanLySinhVien implements QuanLy<SinhVien> {
    private SinhVien[] danhSach = new SinhVien[10];
    private int ngay = 0;

    @Override
    public void them(SinhVien sinhVien) {
        danhSach[ngay] = sinhVien;
        ngay++;
    }

    @Override
    public void sua(String Name, SinhVien sinhVien) {

    }

    @Override
    public void xoa(String Name) {

    }

    @Override
    public int timKiem(String Name) {
        for (int i = 0; i < ngay; i++) {
            if (Name == danhSach[i].getTen()) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public void print() {
        for (int i = 0; i < ngay; i++) {
            System.out.println(danhSach[i]);
        }
    }

    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        SinhVien sv1 = new SinhVien("SV20035", "Duong", 20, 8);
        ql.them(sv1);
        ql.print();
    }
}
