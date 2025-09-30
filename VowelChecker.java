public class VowelChecker
{
    public static boolean vowel(char letter)
    {
        letter = Character.toLowerCase(letter);

        return (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u');
    }

    public static void main(String[] args)
    {
        System.out.println(vowel('a'));
        System.out.println(vowel('E'));
        System.out.println(vowel('x'));
        System.out.println(vowel('U'));
        System.out.println(vowel('z'));
    }
}
