
import java.util.Scanner;

public class lpp {
    static int i = 0;
    static int A, B;

    public static void solve(float a, float b, float c, float d, float e, float f, float[] Z, int choice) {
        float x = 0, y = 0;
        if (e != 0 && (((e * a) - (d * b)) != 0)) {
            x = ((c * e) - (b * f)) / ((e * a) - (d * b));
            y = (f - (d * x)) / e;
        }
        if (x < 0 || y < 0) {
            x = 0;
            y = 0;
        }
        if (choice == 0) {
            Z[i] = A * x + B * y;
        } else if (choice == 1) {
            Z[i] = A * x;
        } else if (choice == 2) {
            Z[i] = B * y;
        } else {
            Z[i] = 0;
        }
        i++;
    }

    public static void Maximize(float Z[]) {
        float sol = 0;
        for (int j = 0; j < 6; j++) {
            if(sol<=Z[j]){
                sol = Z[j];
            }
        }
        System.out.println("Max : "+sol);
    }

    public static void Minimize(float Z[]) {
        float sol = 255;
        for (int j = 0; j < 6; j++) {
            if(sol>=Z[j] && sol!=0){
                sol = Z[j];
            }
        }
        System.out.println("Min : "+sol);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Z[] = new float[6];
        System.out.println("Enter objective function : ");
        System.out.print("Form of equation : AY + BY: ");
        A = sc.nextInt();
        B = sc.nextInt();
        System.out.println("Enter constraints : ");
        System.out.println("Form of equation : ax + by = c");
        System.out.print("Enter value : ");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        System.out.println("Form of equation : dx + ey = f");
        System.out.print("Enter value : ");
        float d = sc.nextInt();
        float e = sc.nextInt();
        float f = sc.nextInt();
        System.out.println("Maximize(0) or Minnimize(1): ");
        int ch =sc.nextInt();
        solve(a, b, c, d, e, f, Z, 0);
        solve(d, 0, f, a, 1, c, Z, 1);
        solve(a, 0, c, d, 1, f, Z, 1);
        solve(1, b, c, 0, e, f, Z, 2);
        solve(0, b, c, 1, e, f, Z, 2);
        solve(1, 0, c, 1, 0, f, Z, 3);
        if(ch==0){
            Maximize(Z);
        }else{
            Minimize(Z);
        }
        sc.close();

    }
}
