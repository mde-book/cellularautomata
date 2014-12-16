package fr.inria.diverse.k3.sample.cellularautomata.visualize.asciiart

import vm.Universe

public class SimpleAsciiArt2DVisualizer {

	public Boolean useEmptyCellForZero
	
	
	def public SimpleAsciiArt2DVisualizer initialize(Boolean useEmptyCellForZero) {
		this.useEmptyCellForZero = useEmptyCellForZero
		return this
	}

	def public visualizeRegular2DUniverse(Integer worldSize, Universe grid) {
		var StringBuffer buf = new StringBuffer
		pringRegular2DUniverse(worldSize, grid, buf)
		println(buf.toString)
	}
	def public pringRegular2DUniverse(Integer worldSize, Universe grid, StringBuffer buf) {
		for (i : 0 ..< worldSize) {
			printLine(worldSize, buf)
			printRow(i, worldSize, grid, buf)
		}
		printLine(worldSize, buf)
		//println(buf.toString)
	}
	
	def public printLine(Integer worldSize, StringBuffer buf) {
		for (i : 0 ..< worldSize) {
			buf.append("----")
		}
		buf.append("-\n")
	}
	
	def public printRow(Integer row,Integer worldSize, Universe grid, StringBuffer buf) {
		buf.append("| ")
		for (i : 0 ..< worldSize) {
			var Integer cellVal = grid.cells.get(row*worldSize + i).^val
			if (!useEmptyCellForZero || cellVal != 0) {
				buf.append(cellVal.toString)
			} else {
				buf.append(" ")
			}
			buf.append(" | ")
		}
		buf.append("\n")
	}
}