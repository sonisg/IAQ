package com.company.designpattern;

public class AbstractDP {
    // Abstract Product Interfaces
    interface Button {
        void click();
    }

    interface Window {
        void display();
    }

    // Concrete Product Classes
    class MacButton implements Button {
        @Override
        public void click() {
            System.out.println("Mac button clicked");
        }
    }

    class WindowsButton implements Button {
        @Override
        public void click() {
            System.out.println("Windows button clicked");
        }
    }

    class MacWindow implements Window {
        @Override
        public void display() {
            System.out.println("Mac window displayed");
        }
    }

    class WindowsWindow implements Window {
        @Override
        public void display() {
            System.out.println("Windows window displayed");
        }
    }

    // Abstract Factory Interface
    interface GUIFactory {
        Button createButton();
        Window createWindow();
    }

    // Concrete Factory Classes
    class MacFactory implements GUIFactory {
        @Override
        public Button createButton() {
            return new MacButton();
        }

        @Override
        public Window createWindow() {
            return new MacWindow();
        }
    }

    class WindowsFactory implements GUIFactory {
        @Override
        public Button createButton() {
            return new WindowsButton();
        }

        @Override
        public Window createWindow() {
            return new WindowsWindow();
        }
    }

    // Client Code

    public static void main(String[] args) {
        AbstractDP abstractDP = new AbstractDP(); // Create an instance of AbstractDP
        GUIFactory factory = abstractDP.new MacFactory(); // or abstractDP.new WindowsFactory
        Button button = factory.createButton();
        Window window = factory.createWindow();

        button.click(); // Output depends on the chosen factory
        window.display(); // Output depends on the chosen factory
    }


}
