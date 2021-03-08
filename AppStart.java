
/**
 * Escreva a descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class AppStart
{
    public void main(String[] args)
    {
        Size size = Size.MEDIUM;
        System.out.println("Name\t\t\t:" +size.name());
        System.out.println("toString\t:" +size.toString());
        System.out.println("Ordem\t\t:" +size.ordinal());
        System.out.println("Valor minimo:" +size.getMinValue());
        System.out.println("Valor maximo:" +size.getMaxValue());
        System.out.println("Codigo\t\t:" +size.getCode());
    }
}
