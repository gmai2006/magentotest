import React from 'react';
import { Graph } from "react-d3-graph";
import {Container} from 'react-bootstrap';

// graph payload (with minimalist structure)
const data = {
  nodes: [{ id: "Harry" }, { id: "Sally" }, { id: "Alice" }],
  links: [
    { source: "Harry", target: "Sally" },
    { source: "Harry", target: "Alice" },
  ],
};

// the graph configuration, just override the ones you need
const myConfig = {
  nodeHighlightBehavior: true,
  node: {
    color: "lightgreen",
    size: 120,
    highlightStrokeColor: "blue",
  },
  link: {
    highlightColor: "lightblue",
  },
};

const onClickNode = function(nodeId) {
  window.alert(`Clicked node ${nodeId}`);
};

const onClickLink = function(source, target) {
  window.alert(`Clicked link between ${source} and ${target}`);
};

const D3Chart = () => {
  return (
      <React.Fragment>
          <Container className='mt-5'>
              
            <Graph
              id="graph-id" // id is mandatory
              data={data}
              config={myConfig}
              onClickNode={onClickNode}
              onClickLink={onClickLink}
            />;

          </Container>
      </React.Fragment>
  )
}

export default D3Chart;

