import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = List.of(
                "Raul - M",
                "Raolita - F",
                "Ana - F",
                "Carlos - M",
                "Marina - F"
        );

        System.out.println("Lista de nomes: " + nomes);

        List<String> nomesFemininos = nomes.stream()
                .filter(nome -> nome.contains(" - F"))
                .collect(Collectors.toList());

        System.out.println("Nomes Femininos: " + nomesFemininos);
    }
}
