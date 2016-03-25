/*  GENERATED CODE */
package generated_ca;

import sim.engine.*;
import sim.field.grid.*;

public class GeneratedAutomataSimulationState extends SimState {
	private static final long serialVersionUID = 1;

	public GeneratedAutomataSimulationState(long seed) {
		super(seed);
	}

	public IntGrid2D grid;

	public int gridWidth = 50;
	public int gridHeight = 50;

	// here generated code according to the initialization rules
	void seedGrid() {
		for (int x = 0; x < gridWidth; x++) {
			for (int y = 0; y < gridWidth; y++) {
				grid.field[x][y] = (((x >= 0 && x <= 49) && y == 0)
						|| (x == 0 && (y >= 0 && y <= 49)) 
						|| ((x >= 1 && x <= 49) && (y >= 1 && y <= 49))) ? 1 : 0;
			}
		}
	}

	@Override
	public void start() {
		super.start();
		grid = new IntGrid2D(gridWidth, gridHeight);
		seedGrid();
		schedule.scheduleRepeating(new MyGeneratedMasonAutomata());
	}

	public static void main(String[] args) {
		GeneratedAutomataSimulationState tutorial1 = new GeneratedAutomataSimulationState(
				System.currentTimeMillis());
		tutorial1.start();
		long steps = 0;
		while (steps < 5000) {
			if (!tutorial1.schedule.step(tutorial1))
				break;
			steps = tutorial1.schedule.getSteps();
			if (steps % 500 == 0)
				System.out.println("Steps: " + steps + " Time: "
						+ tutorial1.schedule.getTime());
		}
		tutorial1.finish();
		System.exit(0);
	}
}
