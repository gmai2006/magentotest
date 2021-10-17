import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'eventId', header: 'eventId', defaultFlex: 1 },
  { name: 'loggedAt', header: 'loggedAt', defaultFlex: 1 },
  { name: 'eventTypeId', header: 'eventTypeId', defaultFlex: 1 },
  { name: 'objectId', header: 'objectId', defaultFlex: 1 },
  { name: 'subjectId', header: 'subjectId', defaultFlex: 1 },
  { name: 'subtype', header: 'subtype', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'reportevent/selectAll',{
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

const ReportEvent = () => {
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

export default ReportEvent;