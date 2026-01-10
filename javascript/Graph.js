class Graph {
  constructor() {
    this.nodes = [];
    this.adList = {};
  }

  addNode(node) {
    this.nodes.push(node);
    this.adList[node] = [];
  }

  addEdge(node1, node2) {
    this.adList[node1].push(node2);
    this.adList[node2].push(node1);
  }
}

const graph = new Graph();

graph.addNode("A");
graph.addNode("B");
graph.addNode("C");
graph.addNode("D");
graph.addNode("E");

graph.addEdge("A", "B");
graph.addEdge("A", "C");
graph.addEdge("B", "D");
graph.addEdge("C", "E");

//graph.adList
console.log(graph.adList);
