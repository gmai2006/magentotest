import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'caseId', header: 'caseId', defaultFlex: 1 },
  { name: 'guaranteeEligible', header: 'guaranteeEligible', defaultFlex: 1 },
  { name: 'guaranteeDisposition', header: 'guaranteeDisposition', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'score', header: 'score', defaultFlex: 1 },
  { name: 'associatedTeam', header: 'associatedTeam', defaultFlex: 1 },
  { name: 'reviewDisposition', header: 'reviewDisposition', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'signifydcase/selectAll',{
    headers : {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
     }
  }).then(response => {
    return response.json().then(data => {
      console.log(data);
      return data;
    })
  })
}

const SignifydCase = () => {
  const dataSource = useCallback(loadData, []);
  return (
      <ReactDataGrid
        idProperty="id"
        style={gridStyle}
        columns={columns}
        pagination
        defaultLimit={15}
        defaultSkip={15}
        dataSource={dataSource}
        />
  )
}

export default SignifydCase;