package TareaUnidad3.main;

public class todosejercicios {
    

    public void imprimirMatrices(String[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (matriz[f][c] != null && !matriz[f][c].equals("")) {
                    System.out.print(matriz[f][c] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }

    public void matriz01(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = "" + numInit;
                numInit++;
            }
        }
        System.out.println("Matriz 1");
        imprimirMatrices(matriz);
    }

    public void matriz02(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < (dimen - i); j++) {
                matriz[i][j] = "" + numInit;
                numInit++;
            }
        }
        System.out.println("Matriz 2");
        imprimirMatrices(matriz);
    }

    public void matriz03(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < (dimen - i); j++) {
                matriz[i][j + i] = "" + numInit;
                numInit++;
            }
        }
        System.out.println("Matriz 3");
        imprimirMatrices(matriz);
    }

    public void matriz04(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];//
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][(dimen - 1) - i + j] = "" + numInit;
                numInit++;
            }
        }
        System.out.println("Matriz 4");
        imprimirMatrices(matriz);
    }

    public void matriz05(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][i - j] = "" + numInit;
                numInit++;
            }
        }
        System.out.println("Matriz 5");
        imprimirMatrices(matriz);
    }

    public void matriz06(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < (dimen - i); j++) {
                matriz[i][(dimen - 1) - (j + i)] = "" + numInit;
                numInit++;
            }
        }
        System.out.println("Matriz 6");
        imprimirMatrices(matriz);
    }

    public void matriz07(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < (dimen - i); j++) {
                matriz[i][(dimen - 1) - j] = "" + numInit;
                numInit++;
            }
        }

        System.out.println("Matriz 7");
        imprimirMatrices(matriz);
    }

    public void matriz08(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];
        for (int j = 0; j < dimen; j++) {
            for (int i = 0; i < (matriz.length) - j; i++) {
                matriz[i][j] = "" + numInit;
                numInit++;
            }
        }
        System.out.println("Matriz 8");
        imprimirMatrices(matriz);
    }

    public void matriz09(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];
        for (int j = 0; j < dimen; j++) {
            for (int i = 0; i < 1 + j; i++) {
                matriz[i][j] = "" + numInit;
                numInit++;
            }
        }
        System.out.println("Matriz 9");
        imprimirMatrices(matriz);
    }

}
