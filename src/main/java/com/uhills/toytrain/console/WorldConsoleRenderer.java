package com.uhills.toytrain.console;

import java.io.PrintStream;

import com.uhills.toytrain.domain.World;
import com.uhills.toytrain.domain.Train;

import de.vandermeer.asciitable.v2.RenderedTable;
import de.vandermeer.asciitable.v2.V2_AsciiTable;
import de.vandermeer.asciitable.v2.render.V2_AsciiTableRenderer;
import de.vandermeer.asciitable.v2.render.WidthLongestWord;
import de.vandermeer.asciitable.v2.themes.V2_E_TableThemes;

public class WorldConsoleRenderer {
    private PrintStream outputStream;


    public WorldConsoleRenderer() {
        outputStream = System.out;
    }

    public WorldConsoleRenderer(PrintStream stream) {
        outputStream = stream;
    }

    private void printTable(V2_AsciiTable asciiTable) {
        V2_AsciiTableRenderer renderer = new V2_AsciiTableRenderer();

//      Outputs as question marks on Windows
        renderer.setTheme(V2_E_TableThemes.UTF_LIGHT.get());

//      renderer.setTheme(V2_E_TableThemes.PLAIN_7BIT.get());
        renderer.setWidth(new WidthLongestWord());

        RenderedTable renderedTable = renderer.render(asciiTable);

        outputStream.println(renderedTable);
    }

    public void printLayer(Object[][] layer) {
        V2_AsciiTable asciiTable = new V2_AsciiTable();

        for (int i=0; i < layer.length; i++) {
            asciiTable.addRule();
            asciiTable.addRow(layer[i]);
        }

        asciiTable.addRule();

        printTable(asciiTable);
    }

    public void printTrain(Train train) {
        V2_AsciiTable asciiTable = new V2_AsciiTable();

        asciiTable.addRule();
        asciiTable.addRow(train.getCars().toArray());
        asciiTable.addRule();

        printTable(asciiTable);
    }

	public void printWorld(World theWorld) {
        outputStream.println("\nRendering train");
        printTrain(theWorld.getTrain());

	    outputStream.println("\nRendering property");
	    printLayer(theWorld.getPropertyLayer());

        outputStream.println("\nRendering terrain");
        printLayer(theWorld.getTerrainLayer());
	}
}
