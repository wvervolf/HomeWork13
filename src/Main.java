public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Book lukamorye = new Book("У лукаморья дуб зеленый", 1810, pushkin);
        lukamorye.setYear(1820);
        System.out.println(lukamorye);

        Author tolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", 1865, tolstoy);
        warAndPeace.setYear(1867);
        System.out.println(warAndPeace);

        Author gogol = new Author("Николай", "Гоголь");
        Book deadSouls = new Book("Мертвые души", 1842, gogol);
        System.out.println(deadSouls);

        System.out.println(lukamorye.equals(warAndPeace));
        System.out.println(lukamorye.equals(lukamorye));






    }
}