/*
  This code can be updated in TWO places. Look for the comments
  in the code that specify where additions should be made.

   (1) Add character names to the selectedOptions ArrayList.
   These names are used to populate the dropdown menu.
   (2) Add additional else-if statements to setCharacter.
   The else-if blocks set the text and image to display for
   the selected character.
 */
package gui;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import heroes.*;

public class Selection {

    private static ImageIcon image;
    private static String text;

    public static ArrayList<String> selectionOptions()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Drax");
        names.add("Gamora");
        names.add("Groot");
        names.add("Rocket");
        names.add("Star Lord");
        names.add("Captain America");
        names.add("Doctor Strange");
        names.add("Falcon");
        names.add("Iron Man");
        names.add("Nick Fury");
        names.add("Spider Man");
        names.add("Vision");
        names.add("Wanda");
        names.add("Winter Solder");
        names.add("Hawkeye");
        names.add("Hulk");
        names.add("War Machine");
        names.add("Carnage");
        names.add("Dr. Doom");
        names.add("Galactus");
        names.add("Maphisto");
        names.add("Rhino");
        names.add("Sandman");
        names.add("Thanos");
        // 1. ADD MORE NAMES TO THE LIST HERE:

        // END OF PART 1
        names.sort(null);
        names.add(0, "Make a selection");
        return names;
    }

    public static void setCharacter(JLabel theLbl, String selectedName) {
        String theText = null;
        ImageIcon theImage = null;
       if (selectedName.equals("Drax"))
       {
           Drax theCharacter = new Drax();
           theText = theCharacter + "\nQuote: " + theCharacter.getQuote();
           theImage = ImageLoader.setImage(theCharacter.getImageFileName());
       }
       else if (selectedName.equals("Gamora"))
       {
           Gamora theCharacter = new Gamora();
           theText = theCharacter + "\nQuote: " + theCharacter.getQuote();
           theImage = ImageLoader.setImage(theCharacter.getImageFileName());
       }
       else if (selectedName.equals("Groot"))
       {
           Groot theCharacter = new Groot();
           theText = theCharacter + "\nQuote: " + theCharacter.getQuote();
           theImage = ImageLoader.setImage(theCharacter.getImageFileName());
       }
       else if (selectedName.equals("Rocket"))
       {
           Rocket theCharacter = new Rocket();
           theText = theCharacter + "\nQuote: " + theCharacter.getQuote();
           theImage = ImageLoader.setImage(theCharacter.getImageFileName());
       }
       else if (selectedName.equals("Star Lord")) {
           StarLord theCharacter = new StarLord();
           theText = theCharacter + "\nQuote: " + theCharacter.getQuote();
           theImage = ImageLoader.setImage(theCharacter.getImageFileName());
       }
       else if (selectedName.equals("Wanda")) {
           Wanda theCharacter = new Wanda("Wanda", "Magic");
           theText = theCharacter.toString() + "\n";
           theImage = null;
       }
       // 2. Add more else-if statements here for new characters:

        // END OF PART 2S
        // DO NOT MAKE ANY CODE CHANGES BELOW THIS LINE.
        theLbl.setIcon(theImage);
        if (theText != null) {
            theLbl.setText(getTextAsHTML(theText));
        } else {
            theLbl.setText("Coming soon...our developers are working hard to update this content.");
        }
    }

    private static String getTextAsHTML(String text) {
        return  "<html>"
                + text.replaceAll("\n", "<br />")
                + "</html>";
    }
}
