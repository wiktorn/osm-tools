/**
 * This file is part of Relation Analyzer for OSM.
 * Copyright (c) 2001 by Adrian Stabiszewski, as@grundid.de
 *
 * Relation Analyzer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Relation Analyzer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Relation Analyzer.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.osmtools.ra.traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.osmtools.api.Section;
import org.osmtools.ra.graph.Graph;
import org.osmtools.ra.graph.IntersectionNode;

public class MultipleRouteTraverser {

	private List<Section> sectionList = new ArrayList<Section>();
	private Collection<IntersectionNode> visitedNodes = new HashSet<IntersectionNode>();

	public MultipleRouteTraverser(Graph graph) {
		IntersectionNode startNode = graph.getLeaves().iterator().next();
		traverseNodes(startNode);
	}

	private void traverseNodes(IntersectionNode startNode) {
		//		currentSection = new SectionContainer("");
		//		sectionList.add(currentSection);
		//		currentSection.path.add(startNode.getNode());
		//		do {
		//			visitedNodes.add(startNode);
		//			IntersectionNode nextNode = getNextNode(startNode);
		//
		//			path.add(nextNode.getNode());
		//			startNode = nextNode;
		//		} while (!startNode.equals(endNode));
	}

	//	private IntersectionNode getNextNode(IntersectionNode startNode) {
	//		Iterator<IntersectionNode> edgeIterator = startNode.getEdgesIterator();
	//		IntersectionNode nextNode = edgeIterator.next();
	//
	//		IntersectionNode possibleEndNode = nextNode.equals(endNode) ? nextNode : null;
	//		while (visitedNodes.contains(nextNode)) {
	//			if (edgeIterator.hasNext()) {
	//				nextNode = edgeIterator.next();
	//				if (nextNode.equals(endNode))
	//					possibleEndNode = nextNode;
	//			}
	//			else {
	//				if (nextNode.equals(endNode)) {
	//					break;
	//				}
	//				else if (possibleEndNode != null) {
	//					nextNode = possibleEndNode;
	//				}
	//				else
	//					throw new AnalyzerException("No way to go. All nodes visited before.");
	//			}
	//		}
	//		return nextNode;
	//	}
}
