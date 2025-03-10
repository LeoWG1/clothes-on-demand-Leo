package org.example.View;

import org.example.Controller.OrderManager;
import org.example.Model.Products.Pants;
import org.example.Model.Products.Skirt;
import org.example.Model.Products.TShirt;

import java.util.Scanner;

public class OrderView {
    private String size;
    private String material;
    private String color;

    private final OrderManager orderManager = new OrderManager();

    public void displayProducts(Scanner customerInput) {
        System.out.println("Vänligen välj en produkt du skulle vilja köpa!");

        System.out.println("1. Byxor\n2. Kjol\n3. T-shirt");


        while (true) {
            int productChoice = customerInput.nextInt();
            if (productChoice == 1) {
                displayPantsChoices(customerInput);
                break;
            } else if (productChoice == 2) {
                displaySkirtChoices(customerInput);
                break;
            } else if (productChoice == 3) {
                displayTShirtChoices(customerInput);
                break;
            } else {
                System.out.println("Du har gjort ett felaktigt val!");
            }
        }

    }

    private void displayPantsChoices(Scanner customerInput) {
        String fit = "";
        double length = 0;
        boolean isPantsChoicesCorrect = false;
        Pants pants = new Pants();
        pants.setName("Byxor");
        pants.setPrice(600);


        System.out.println("Pris:" + pants.getPrice());

        while (!isPantsChoicesCorrect) {
            System.out.println("Välj en storlek:");
            System.out.println("1. S\n2. M\n3. L");
            // Switch-case here
            int sizeChoice = customerInput.nextInt();
            customerInput.nextLine(); // Have to have it or it messes up the loop, apparently cause of the \n
            switch (sizeChoice) {
                case 1:
                    System.out.println("Du har valt S-storlek");
                    size = "Small";
                    break;
                case 2:
                    System.out.println("Du har valt M-storlek");
                    size = "Medium";
                    break;
                case 3:
                    System.out.println("Du har valt L-storlek");
                    size = "Large";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Välj material:");
            System.out.println("1. Denim\n2. Bomull\n3. Polyester");

            int materialChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (materialChoice) {
                case 1:
                    System.out.println("Du har valt Denim material");
                    material = "Denim";
                    break;
                case 2:
                    System.out.println("Du har valt Bomull material");
                    material = "Bomull";
                    break;
                case 3:
                    System.out.println("Du har valt Polyester material");
                    material = "Polyester";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }
            System.out.println("Välj färg:");
            System.out.println("1. Blå\n2. Svart\n3. Grå");

            int colorChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (colorChoice) {
                case 1:
                    System.out.println("Du har valt Blå som färg");
                    color = "Blå";
                    break;
                case 2:
                    System.out.println("Du har valt Svart som färg");
                    color = "Svart";
                    break;
                case 3:
                    System.out.println("Du har valt Grå som färg");
                    color = "Grå";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Välj fit:");
            System.out.println("1. Slim Fit\n2. Regular Fit");

            int fitChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (fitChoice) {
                case 1:
                    System.out.println("Du har valt Slim Fit");
                    fit = "Slim Fit";
                    break;
                case 2:
                    System.out.println("Du har valt Regular Fit");
                    fit = "Regular Fit";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Välj längd:");
            System.out.println("1. 94 cm\n2. 97 cm");

            int lengthChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (lengthChoice) {
                case 1:
                    System.out.println("Du har valt 90-95 cm");
                    length = 94;
                    break;
                case 2:
                    System.out.println("Du har valt 95-100 cm");
                    length = 97;
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Så här kommer dina byxor att se ut:");
            System.out.println("Storlek: " + size + "\nMaterial: " + material + "\nFärg: " + color +
                    "\nFit: " + fit + "\nLängd: " + length);
            System.out.println("Stämmer detta? (Y/N)");

            String answer = customerInput.nextLine();
            // Add while-loop. If Y, run method below, otherwise customer chooses again.
            if (answer.equalsIgnoreCase("Y")) {
                isPantsChoicesCorrect = true;
                orderManager.placePantsOrder(size, material, color, fit, length, pants.getPrice());
                // Loop breaks
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("Vänligen välj dina val igen");
            } else {
                System.out.println("Du har angett ett ogiltigt val!");
            }
        }
    }

    private void displaySkirtChoices(Scanner customerInput) {
        double waistline = 0;
        String pattern = "";
        boolean isSkirtChoicesCorrect = false;
        Skirt skirt = new Skirt();
        skirt.setName("Kjol");
        skirt.setPrice(300);


        System.out.println("Pris:" + skirt.getPrice());

        while (!isSkirtChoicesCorrect) {
            System.out.println("Välj en storlek:");
            System.out.println("1. S\n2. M\n3. L");
            // Switch-case here
            int sizeChoice = customerInput.nextInt();
            customerInput.nextLine(); // Have to have it or it messes up the loop, apparently cause of the \n
            switch (sizeChoice) {
                case 1:
                    System.out.println("Du har valt S-storlek");
                    size = "Small";
                    break;
                case 2:
                    System.out.println("Du har valt M-storlek");
                    size = "Medium";
                    break;
                case 3:
                    System.out.println("Du har valt L-storlek");
                    size = "Large";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Välj material:");
            System.out.println("1. Siden\n2. Bomull\n3. Satin");

            int materialChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (materialChoice) {
                case 1:
                    System.out.println("Du har valt Siden material");
                    material = "Siden";
                    break;
                case 2:
                    System.out.println("Du har valt Bomull material");
                    material = "Bomull";
                    break;
                case 3:
                    System.out.println("Du har valt Satin material");
                    material = "Satin";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }
            System.out.println("Välj färg:");
            System.out.println("1. Röd\n2. Svart\n3. Rosa");

            int colorChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (colorChoice) {
                case 1:
                    System.out.println("Du har valt Röd som färg");
                    color = "Röd";
                    break;
                case 2:
                    System.out.println("Du har valt Svart som färg");
                    color = "Svart";
                    break;
                case 3:
                    System.out.println("Du har valt Rosa som färg");
                    color = "Rosa";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Välj midje-längd:");
            System.out.println("1. 46cm\n2. 49cm");

            int waistlineChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (waistlineChoice) {
                case 1:
                    System.out.println("Du har valt 46 cm");
                    waistline = 46;
                    break;
                case 2:
                    System.out.println("Du har valt 49 cm");
                    waistline = 49;
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Välj mönster:");
            System.out.println("1. Blommor\n2. Vågor");

            int patternChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (patternChoice) {
                case 1:
                    System.out.println("Du har valt ett blomstermönster");
                    pattern = "Blommor";
                    break;
                case 2:
                    System.out.println("Du har valt ett vågmönster");
                    pattern = "Vågor";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Så här kommer dina byxor att se ut:");
            System.out.println("Storlek: " + size + "\nMaterial: " + material + "\nFärg: " + color +
                    "\nMidjelängd: " + waistline + "cm\nMönster: " + pattern);
            System.out.println("Stämmer detta? (Y/N)");

            String answer = customerInput.nextLine();
            // Add while-loop. If Y, run method below, otherwise customer chooses again.
            if (answer.equalsIgnoreCase("Y")) {
                isSkirtChoicesCorrect = true;
                orderManager.placeSkirtOrder(size, material, color, waistline, pattern, skirt.getPrice());
                // Loop breaks
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("Vänligen välj dina val igen");
            } else {
                System.out.println("Du har angett ett ogiltigt val!");
            }
        }
    }
    private void displayTShirtChoices (Scanner customerInput){
        String sleeves = "";
        String neck = "";
        boolean isTShirtChoicesCorrect = false;
        TShirt tShirt = new TShirt();
        tShirt.setName("T-shirt");
        tShirt.setPrice(150);


        System.out.println("Pris:" + tShirt.getPrice());

        while (!isTShirtChoicesCorrect) {
            System.out.println("Välj en storlek:");
            System.out.println("1. S\n2. M\n3. L");
            // Switch-case here
            int sizeChoice = customerInput.nextInt();
            customerInput.nextLine(); // Have to have it or it messes up the loop, apparently cause of the \n
            switch (sizeChoice) {
                case 1:
                    System.out.println("Du har valt S-storlek");
                    size = "Small";
                    break;
                case 2:
                    System.out.println("Du har valt M-storlek");
                    size = "Medium";
                    break;
                case 3:
                    System.out.println("Du har valt L-storlek");
                    size = "Large";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Välj material:");
            System.out.println("1. Linne\n2. Bomull\n3. Polyester");

            int materialChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (materialChoice) {
                case 1:
                    System.out.println("Du har valt Linne material");
                    material = "Linne";
                    break;
                case 2:
                    System.out.println("Du har valt Bomull material");
                    material = "Bomull";
                    break;
                case 3:
                    System.out.println("Du har valt Polyester material");
                    material = "Polyester";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }
            System.out.println("Välj färg:");
            System.out.println("1. Röd\n2. Svart\n3. Vit");

            int colorChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (colorChoice) {
                case 1:
                    System.out.println("Du har valt Röd som färg");
                    color = "Röd";
                    break;
                case 2:
                    System.out.println("Du har valt Svart som färg");
                    color = "Svart";
                    break;
                case 3:
                    System.out.println("Du har valt Vit som färg");
                    color = "Vit";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Välj ärm-stil:");
            System.out.println("1. Loose\n2. Fitted");

            int waistlineChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (waistlineChoice) {
                case 1:
                    System.out.println("Du har valt Loose");
                    sleeves = "Loose";
                    break;
                case 2:
                    System.out.println("Du har valt Fitted");
                    sleeves = "Fitted";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Välj nack-stil:");
            System.out.println("1. V-neck\n2. Polo");

            int patternChoice = customerInput.nextInt();
            customerInput.nextLine();
            switch (patternChoice) {
                case 1:
                    System.out.println("Du har valt V-neck");
                    neck = "V-neck";
                    break;
                case 2:
                    System.out.println("Du har valt Polo");
                    neck = "Polo";
                    break;
                default:
                    System.out.println("Du har gjort ett felaktigt val!");
                    continue;
            }

            System.out.println("Så här kommer dina byxor att se ut:");
            System.out.println("Storlek: " + size + "\nMaterial: " + material + "\nFärg: " + color +
                    "\nÄrm-stil: " + sleeves + "\nNack-stil: " + neck);
            System.out.println("Stämmer detta? (Y/N)");

            String answer = customerInput.nextLine();
            // Add while-loop. If Y, run method below, otherwise customer chooses again.
            if (answer.equalsIgnoreCase("Y")) {
                isTShirtChoicesCorrect = true;
                orderManager.placeTShirtOrder(size, material, color, sleeves, neck, tShirt.getPrice());
                // Loop breaks
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("Vänligen välj dina val igen");
            } else {
                System.out.println("Du har angett ett ogiltigt val!");
            }
        }


    }

}