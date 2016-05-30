package cellularautomata.mason.utils;

import sim.field.grid.IntGrid2D;

public class Utils {

	/**
	 * return the Sum of all neighbors of the given cell in the grid
	 * @param tempGrid
	 * @param x
	 * @param y
	 * @return
	 */
	public static int neighborSum(IntGrid2D tempGrid, int x, int y){
		int count = 0;
		for(int dx = -1; dx < 2; dx++)
	        for(int dy = -1; dy < 2; dy++)
	            count += tempGrid.field[tempGrid.stx(x+dx)][tempGrid.sty(y+dy)];
		return count;
	}
	
	/**
	 * return the Sum of all neighbors of the given cell in the grid, but only for the neighbors whose val is within the range
	 * @param tempGrid
	 * @param x
	 * @param y
	 * @return
	 */
	public static int neighborSum(IntGrid2D tempGrid, int x, int y, RangeFilter rangeFilter){
		int count = 0;
		for(int dx = -1; dx < 2; dx++)
	        for(int dy = -1; dy < 2; dy++){
	        	int val = tempGrid.field[tempGrid.stx(x+dx)][tempGrid.sty(y+dy)];
	        	if(rangeFilter.isInFilter(val))
	        		count += tempGrid.field[tempGrid.stx(x+dx)][tempGrid.sty(y+dy)];
	        }
		return count;
	}
	
	/**
	 * return the Min value of all neighbors of the given cell in the grid
	 * @param tempGrid
	 * @param x
	 * @param y
	 * @return
	 */
	public static int neighborMin(IntGrid2D tempGrid, int x, int y){
		int min = Integer.MAX_VALUE;
		for(int dx = -1; dx < 2; dx++)
	        for(int dy = -1; dy < 2; dy++){
	        	int val = tempGrid.field[tempGrid.stx(x+dx)][tempGrid.sty(y+dy)];
	        	if(val < min)
	        		min= val;
	        }
		return min;
	}
	/**
	 * return the Min value of all neighbors of the given cell in the grid, but only for the neighbors whose val is within the range
	 * @param tempGrid
	 * @param x
	 * @param y
	 * @return
	 */
	public static int neighborMin(IntGrid2D tempGrid, int x, int y, RangeFilter rangeFilter){
		int min = Integer.MAX_VALUE;
		for(int dx = -1; dx < 2; dx++)
	        for(int dy = -1; dy < 2; dy++){
	        	int val = tempGrid.field[tempGrid.stx(x+dx)][tempGrid.sty(y+dy)];
	        	if(val < min && rangeFilter.isInFilter(val))
	        		min= val;
	        }
		return min;
	}
	
	/**
	 * return the Max value of all neighbors of the given cell in the grid
	 * @param tempGrid
	 * @param x
	 * @param y
	 * @return
	 */
	public static int neighborMax(IntGrid2D tempGrid, int x, int y){
		int max = Integer.MIN_VALUE;
		for(int dx = -1; dx < 2; dx++)
	        for(int dy = -1; dy < 2; dy++){
	        	int val = tempGrid.field[tempGrid.stx(x+dx)][tempGrid.sty(y+dy)];
	        	if(val > max)
	        		max= val;
	        }
		return max;
	}
	/**
	 * return the Max value of all neighbors of the given cell in the grid, but only for the neighbors whose val is within the range
	 * @param tempGrid
	 * @param x
	 * @param y
	 * @return
	 */
	public static int neighborMax(IntGrid2D tempGrid, int x, int y, RangeFilter rangeFilter){
		int max = Integer.MIN_VALUE;
		for(int dx = -1; dx < 2; dx++)
	        for(int dy = -1; dy < 2; dy++){
	        	int val = tempGrid.field[tempGrid.stx(x+dx)][tempGrid.sty(y+dy)];
	        	if(val > max && rangeFilter.isInFilter(val))
	        		max= val;
	        }
		return max;
	}
	
}
