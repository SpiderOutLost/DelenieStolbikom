public class DelenieStolbik {
    private int a; // 1 число
    private int b; // 2 число
    private int n; //кол-во чисел после запятой

    public static void DelenieStolbik(int a, int b, int n){
        int ostatok;
        int chastnoe;
        int promezutok = a;
        StringBuilder promegutOtvet = new StringBuilder();
        if (a<b){
            promegutOtvet.append("0.");
            promezutok*=10;
        }

        do {
            if (promezutok < b) {
                promezutok *= 10;
                promegutOtvet.append("0");
                n--;

            }
            if (promezutok>b){
                chastnoe = promezutok / b;
                ostatok = promezutok - (b*chastnoe);
                promezutok = ostatok*10;
                promegutOtvet.append(String.valueOf(chastnoe));
                n--;
            }

        } while (n!=0);

        System.out.println(promegutOtvet);;
    }
}
