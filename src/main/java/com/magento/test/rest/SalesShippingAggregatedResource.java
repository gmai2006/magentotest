/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.magento.test.rest;

import static java.util.Objects.requireNonNull;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.magento.test.service.SalesShippingAggregatedService;
import com.magento.test.entity.SalesShippingAggregated;

@Path("/salesshippingaggregated")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
public class SalesShippingAggregatedResource {

  @Inject private SalesShippingAggregatedService service;

  public SalesShippingAggregatedResource() {}

  public SalesShippingAggregatedResource(final SalesShippingAggregatedService service) {
    requireNonNull(service);
    this.service = service;
  }

  /**
   * hello.
   *
   * @return a hello.
   */
  @GET
  @Path("")
  public Response hello() {
    return Response.status(Response.Status.OK).entity(this.getClass().getName()).build();
  }

  /**
   * InIdempotent method. Update existing SalesShippingAggregated.
   *
   * @param obj - instance of SalesShippingAggregated.
   * @return SalesShippingAggregated.
   */
  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public SalesShippingAggregated update(SalesShippingAggregated obj) {
    return this.service.update(obj);
  }

  /**
   * Delete existing SalesShippingAggregated.
   *
   * @param id instance of SalesShippingAggregated.
   * @return SalesShippingAggregated.
   */

  /**
   * Select all SalesShippingAggregated with limit of returned records.
   *
   * @param max - number of records.
   * @return a list SalesShippingAggregated.
   */
  @GET
  @Path("select/{max}")
  public Response findWithLimit(@PathParam("max") String max) {
    Integer input = null;
    try {
      input = Integer.valueOf(max);
    } catch (NumberFormatException ex) {
      throw new WebApplicationException(Response.Status.BAD_REQUEST);
    }
    List<SalesShippingAggregated> result = service.select(input);

    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select all SalesShippingAggregated records.
   *
   * @return a list SalesShippingAggregated.
   */
  @GET
  @Path("selectAll")
  public Response selectAll() {
    List<SalesShippingAggregated> result = service.selectAll();

    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }
}
