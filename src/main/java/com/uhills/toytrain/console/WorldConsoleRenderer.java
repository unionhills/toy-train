package com.uhills.toytrain.console;

import java.io.PrintStream;

import com.uhills.toytrain.domain.Terrain;
import com.uhills.toytrain.domain.World;

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

    public void printTerrainLayer(Terrain[][] terrainLayer) {
        V2_AsciiTable asciiTable = new V2_AsciiTable();

        for (int i=0; i < terrainLayer.length; i++) {
            asciiTable.addRule();
            asciiTable.addRow(terrainLayer[i]);
        }

        asciiTable.addRule();

        V2_AsciiTableRenderer renderer = new V2_AsciiTableRenderer();
        renderer.setTheme(V2_E_TableThemes.PLAIN_7BIT.get());
        renderer.setWidth(new WidthLongestWord());

        RenderedTable renderedTable = renderer.render(asciiTable);

        outputStream.println(renderedTable);
    }

	public void printWorld(World theWorld) {
	    printTerrainLayer(theWorld.getTerrainLayer());
	    //TODO: printSceneryLayer(theWorld.getSceneryLayer());
	}
}
