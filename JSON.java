package CIP;

import java.io.IOException;
import java.io.*;

public class json {
    public static void main(String[] args)throws IOException
    {
        LoanApplication loanApplication = ExampleLoan.LOAN_APPLICATION;

        System.out.println(loanApplication);

        System.out.println();

        toJsonString(loanApplication);
    }

    private static void toJsonString(final LoanApplication loanApplication) throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writer();
        objectWriter.writeValue(System.out, loanApplication); 
    }
}
