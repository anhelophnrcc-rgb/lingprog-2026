public class InterseccaoVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] vInter = new int[5]; // tamanho máximo possível
        int k = 0;

        System.out.println("Preencha o Vetor 1:");
        for (int i = 0; i < v1.length; i++) {
            v1[i] = entrada.nextInt();
        }

        System.out.println("Preencha o Vetor 2:");
        for (int i = 0; i < v2.length; i++) {
            v2[i] = entrada.nextInt();
        }

        // INTERSEÇÃO
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    vInter[k] = v1[i];
                    k++;
                    break; // evita repetir o mesmo elemento
                }
            }
        }

        System.out.print("\nVetor Interseção: ");
        for (int i = 0; i < k; i++) {
            System.out.print(vInter[i] + " ");
        }
    }
}

