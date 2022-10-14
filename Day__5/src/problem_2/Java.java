package problem_2;

public class Java {

    void Vowel_Consonant(char ch)
    {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                || ch == 'u' || ch == 'A' || ch == 'E' || ch== 'I'
                || ch == 'O' || ch== 'U')
        {
            System.out.println(ch +" is a Vowel.");
        }


        else if (ch >= 'a' && ch <= 'z' || ch>='A' && ch<='Z') {
            System.out.println(ch+" is a consonant.");
        }
        else {
            System.out.println("error");
        }
    }

    // The Driver code
    static public void main(String[] args)
    {

        Java obj = new Java();
        obj.Vowel_Consonant('a');
        obj.Vowel_Consonant('W');
        obj.Vowel_Consonant('7');

    }

}

