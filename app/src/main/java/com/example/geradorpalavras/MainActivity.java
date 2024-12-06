package com.example.geradorpalavras;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Frase[] frases = {
            new Frase("A persistência é o caminho do êxito.", "Charles Chaplin"),
            new Frase("No meio da dificuldade encontra-se a oportunidade.", "Albert Einstein"),
            new Frase("O que não provoca minha morte faz com que eu fique mais forte.", "Friedrich Nietzsche"),
            new Frase("A vida é para quem topa qualquer parada. Não para quem para em qualquer topada.", "Bob Marley"),
            new Frase("Inspiração vem dos outros. Motivação vem de dentro de nós.", "Desconhecido"),
            new Frase("O que me preocupa não é o grito dos maus. É o silêncio dos bons.", "Martin Luther King"),
            new Frase("O sucesso normalmente vem para quem está ocupado demais para procurar por ele.", "Henry David Thoreau"),
            new Frase("A vida é melhor para aqueles que fazem o possível para ter o melhor", "John Wooden"),
            new Frase("A vida reserva alegrias para aqueles que sabem rir.", "Desconhecido"),
            new Frase("O sucesso é a soma de pequenos esforços repetidos dia após dia.", "Robert Collier"),
            new Frase("Enquanto houver vontade de lutar haverá esperança de vencer.", "Desconhecido"),
            new Frase("Dê mais atenção ao seu caráter do que à sua reputação, porque seu caráter é o que você realmente é, enquanto sua reputação é apenas o que os outros pensam que você é.", "John Wooden"),
            new Frase("O pessimista vê dificuldade em cada oportunidade; O otimista vê oportunidade em cada dificuldade.", "Winston Churchill"),
            new Frase("Muitas das grandes realizações do mundo foram feitas por homens cansados e desanimados que continuaram trabalhando.", "Desconhecido"),
            new Frase("O que se faz com alegria e paixão está sempre bem feito.", "Desconhecido"),
            new Frase("Nenhum obstáculo será grande se a sua vontade de vencer for maior.", "Desconhecido")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void inserirFrase(View view) {
        TextView textoFrase = findViewById(R.id.TextoFraseDoDia);
        int numero = new Random().nextInt(frases.length);
        textoFrase.setPadding(50, 0, 50, 0);
        textoFrase.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textoFrase.setText(frases[numero].toString());
    }

    public void mostrarTodasFrases(View view) {
        TextView textoMostrarTodasFrase = findViewById(R.id.TextoMostrarTodasFrases);
        textoMostrarTodasFrase.setPadding(50, 0, 50, 0);
        textoMostrarTodasFrase.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textoMostrarTodasFrase.setMovementMethod(new android.text.method.ScrollingMovementMethod());
        textoMostrarTodasFrase.setText("\n\n");

        // Adicionar scrolling na tela do aplicativo para mostrar todas as frases



        for (int i = 0; i < 20; i++) {
            int numeroFraseAleatoria = new Random().nextInt(frases.length);
            textoMostrarTodasFrase.append(frases[numeroFraseAleatoria].toString() + "\n\n");
        }
    }
}