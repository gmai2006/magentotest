import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityTypeId', header: 'entityTypeId', defaultFlex: 1 },
  { name: 'entityTypeCode', header: 'entityTypeCode', defaultFlex: 1 },
  { name: 'entityModel', header: 'entityModel', defaultFlex: 1 },
  { name: 'attributeModel', header: 'attributeModel', defaultFlex: 1 },
  { name: 'entityTable', header: 'entityTable', defaultFlex: 1 },
  { name: 'valueTablePrefix', header: 'valueTablePrefix', defaultFlex: 1 },
  { name: 'entityIdField', header: 'entityIdField', defaultFlex: 1 },
  { name: 'isDataSharing', header: 'isDataSharing', defaultFlex: 1 },
  { name: 'dataSharingKey', header: 'dataSharingKey', defaultFlex: 1 },
  { name: 'defaultAttributeSetId', header: 'defaultAttributeSetId', defaultFlex: 1 },
  { name: 'incrementModel', header: 'incrementModel', defaultFlex: 1 },
  { name: 'incrementPerStore', header: 'incrementPerStore', defaultFlex: 1 },
  { name: 'incrementPadLength', header: 'incrementPadLength', defaultFlex: 1 },
  { name: 'incrementPadChar', header: 'incrementPadChar', defaultFlex: 1 },
  { name: 'additionalAttributeTable', header: 'additionalAttributeTable', defaultFlex: 1 },
  { name: 'entityAttributeCollection', header: 'entityAttributeCollection', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'eaventitytype/selectAll',{
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

const EavEntityType = () => {
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

export default EavEntityType;