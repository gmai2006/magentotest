import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'pageId', header: 'pageId', defaultFlex: 1 },
  { name: 'instanceId', header: 'instanceId', defaultFlex: 1 },
  { name: 'pageGroup', header: 'pageGroup', defaultFlex: 1 },
  { name: 'layoutHandle', header: 'layoutHandle', defaultFlex: 1 },
  { name: 'blockReference', header: 'blockReference', defaultFlex: 1 },
  { name: 'pageFor', header: 'pageFor', defaultFlex: 1 },
  { name: 'entities', header: 'entities', defaultFlex: 1 },
  { name: 'pageTemplate', header: 'pageTemplate', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'widgetinstancepage/selectAll',{
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

const WidgetInstancePage = () => {
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

export default WidgetInstancePage;