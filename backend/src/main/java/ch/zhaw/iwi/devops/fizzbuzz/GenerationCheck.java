package ch.zhaw.iwi.devops.fizzbuzz;

public class GenerationCheck {
    
    public String GenerationCheck(int jahrgang){
        if (jahrgang >= 2011 && jahrgang <= 2025){
            return "Generation Alpha";
        } else if (jahrgang >= 1997 && jahrgang <= 2010){
            return "Generation Z";
        } else if (jahrgang >= 1981 && jahrgang <= 1996){
            return "Generation Y";
        } else if (jahrgang >= 1965 && jahrgang <= 1980){
            return "Generation X";
        } else if (jahrgang >= 1946 && jahrgang <= 1964){
            return "Generation Boomer";
        } else if (jahrgang >= 1928 && jahrgang <= 1945){
            return "Generation Silent";
        }          
        return "undefinierba";
    }
}
