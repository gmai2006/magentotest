import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'attributeId', header: 'attributeId', defaultFlex: 1 },
  { name: 'frontendInputRenderer', header: 'frontendInputRenderer', defaultFlex: 1 },
  { name: 'isGlobal', header: 'isGlobal', defaultFlex: 1 },
  { name: 'isVisible', header: 'isVisible', defaultFlex: 1 },
  { name: 'isSearchable', header: 'isSearchable', defaultFlex: 1 },
  { name: 'isFilterable', header: 'isFilterable', defaultFlex: 1 },
  { name: 'isComparable', header: 'isComparable', defaultFlex: 1 },
  { name: 'isVisibleOnFront', header: 'isVisibleOnFront', defaultFlex: 1 },
  { name: 'isHtmlAllowedOnFront', header: 'isHtmlAllowedOnFront', defaultFlex: 1 },
  { name: 'isUsedForPriceRules', header: 'isUsedForPriceRules', defaultFlex: 1 },
  { name: 'isFilterableInSearch', header: 'isFilterableInSearch', defaultFlex: 1 },
  { name: 'usedInProductListing', header: 'usedInProductListing', defaultFlex: 1 },
  { name: 'usedForSortBy', header: 'usedForSortBy', defaultFlex: 1 },
  { name: 'applyTo', header: 'applyTo', defaultFlex: 1 },
  { name: 'isVisibleInAdvancedSearch', header: 'isVisibleInAdvancedSearch', defaultFlex: 1 },
  { name: 'position', header: 'position', defaultFlex: 1 },
  { name: 'isWysiwygEnabled', header: 'isWysiwygEnabled', defaultFlex: 1 },
  { name: 'isUsedForPromoRules', header: 'isUsedForPromoRules', defaultFlex: 1 },
  { name: 'isRequiredInAdminStore', header: 'isRequiredInAdminStore', defaultFlex: 1 },
  { name: 'isUsedInGrid', header: 'isUsedInGrid', defaultFlex: 1 },
  { name: 'isVisibleInGrid', header: 'isVisibleInGrid', defaultFlex: 1 },
  { name: 'isFilterableInGrid', header: 'isFilterableInGrid', defaultFlex: 1 },
  { name: 'searchWeight', header: 'searchWeight', defaultFlex: 1 },
  { name: 'additionalData', header: 'additionalData', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'catalogeavattribute/selectAll',{
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

const CatalogEavAttribute = () => {
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

export default CatalogEavAttribute;