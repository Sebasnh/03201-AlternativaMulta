/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        final double CANTIDAD_MULTA = 60.0;
        final int PLAZO_DESCUENTO = 30;
        final int DESCUENTO = 20;

        int dias;
        boolean testOk;
        double importeDescuento = 0;

        try {

            System.out.println("Alternativa de multa");
            System.out.println("====================");

            System.out.print("Días de demora ...........: ");
            dias = SCN.nextInt();
            SCN.nextLine();

            System.out.println("---");

            System.out.printf(Locale.ENGLISH, "Importe inicial multa ....: %.2f €%n", CANTIDAD_MULTA);

            System.out.println("---");

            System.out.printf("Plazo con descuento ......: %d días%n", PLAZO_DESCUENTO);

            System.out.printf("Tanto descuento ..........: %d %%%n", DESCUENTO);

            testOk = dias < PLAZO_DESCUENTO;

            if (testOk) {
                importeDescuento = CANTIDAD_MULTA * DESCUENTO / 100;
            }

            System.out.printf(Locale.ENGLISH, "Importe descuento ........: %.2f €%n", importeDescuento);

            System.out.println("---");

            double importeFinal = CANTIDAD_MULTA - importeDescuento;

            System.out.printf(Locale.ENGLISH, "Importe final multa ......: %.2f €%n", importeFinal);

        } catch (Exception e) {
            System.out.print("ERROR: Entrada incorrecta");
            SCN.nextLine();

        } finally {
        }

    }
}
