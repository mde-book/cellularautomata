/*
  Copyright 2006 by Sean Luke and George Mason University
  Licensed under the Academic Free License version 3.0
  See the file "LICENSE" for more information
*/

package generated_ca;
import sim.engine.*;
import sim.display.*;
import sim.portrayal.grid.*;
import java.awt.*;
import javax.swing.*;

public class GeneratedAutomataGUI extends GUIState
    {
    public Display2D display;
    public JFrame displayFrame;

    public GeneratedAutomataGUI() { super(new GeneratedAutomataSimulationState(System.currentTimeMillis())); }
    
    public GeneratedAutomataGUI(SimState state) { super(state); }
    
    public static String getName() { return "GeneratedAutomata"; }

   public static Object getInfo()
   {
   return 
   "<H2>GeneratedAutomata</H2>" +
   "<p>... with CAER evolution Rules:</p>"+
   "<code>when [1,1] nextValue = {<br>"+ 
   "	if neighborsSum == 2 | neighborsSum == 3 {1} else {0} }<br>"+ 
   "when [0,0] nextValue = {<br>"+ 
   "	if neighborsSum == 3 {1} else {0} }</code>"+ 
   "<p>... with CAIR intialization Rules:</p>"+
   "<code>regularGeometry {50 x 50}<br>"+ 
   "init {[1..50] x 1} = { 1 }<br>"+
   "init { 1 x [1..50]} = { 1 }<br>"+
   "init {[2..50] x [2..50]} = { 0 }</code>"; 
   }


    FastValueGridPortrayal2D gridPortrayal = new FastValueGridPortrayal2D();

    public void setupPortrayals()
        {
        // tell the portrayals what to portray and how to portray them
        gridPortrayal.setField(((GeneratedAutomataSimulationState)state).grid);
        gridPortrayal.setMap(
            new sim.util.gui.SimpleColorMap(
                new Color[] {new Color(0,0,0,0), Color.blue}));
        }
    
    @Override
	public void start()
        {
        super.start();      
        setupPortrayals();  // set up our portrayals
        display.reset();    // reschedule the displayer
        display.repaint();  // redraw the display
        }
    
    @Override
	public void init(Controller c)
        {
        super.init(c);
        
        // Make the Display2D.  We'll have it display stuff later.
        GeneratedAutomataSimulationState tut = (GeneratedAutomataSimulationState)state;
        display = new Display2D(tut.gridWidth * 4, tut.gridHeight * 4,this);
        displayFrame = display.createFrame();
        c.registerFrame(displayFrame);   // register the frame so it appears in the "Display" list
        displayFrame.setVisible(true);

        // attach the portrayals
        display.attach(gridPortrayal,"Life");

        // specify the backdrop color  -- what gets painted behind the displays
        display.setBackdrop(Color.black);
        }

    public static void main(String[] args)
        {
        GeneratedAutomataGUI tutorial2 = new GeneratedAutomataGUI();
        Console c = new Console(tutorial2);
        c.setVisible(true);
        }
    
    @Override
	public void load(SimState state)
        {
        super.load(state);
        setupPortrayals();  // we now have new grids.  Set up the portrayals to reflect this
        display.reset();    // reschedule the displayer
        display.repaint();  // redraw the display
        }
        
    }
    
    
    
    
    
