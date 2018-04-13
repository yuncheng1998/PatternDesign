package com.fafnir.FactoryPattern.AbstractFactoryPattern;

    class NewYorkPizzaStore extends PizzaStore {
        private Pizza pizza = null;

        protected Pizza createPizza(String item) {
            IngredientFactory pizzaIngredientFactory = new NewYorkIngredientFactory();

            if (item.equals("cheese")) {
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            } else if (item.equals("clam")) {
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Clam Pizza");
            }
            return pizza;
        }
    }
