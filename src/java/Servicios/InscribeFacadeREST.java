/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Inscribe;
import Entidades.InscribePK;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author Miller
 */
@javax.ejb.Stateless
@Path("entidades.inscribe")
public class InscribeFacadeREST extends AbstractFacade<Inscribe> {

    @PersistenceContext(unitName = "reportesAppTomPU")
    private EntityManager em;

    private InscribePK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codE=codEValue;idP=idPValue;codA=codAValue;grupo=grupoValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        Entidades.InscribePK key = new Entidades.InscribePK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> codE = map.get("codE");
        if (codE != null && !codE.isEmpty()) {
            key.setCodE(new java.lang.Long(codE.get(0)));
        }
        java.util.List<String> idP = map.get("idP");
        if (idP != null && !idP.isEmpty()) {
            key.setIdP(new java.lang.Long(idP.get(0)));
        }
        java.util.List<String> codA = map.get("codA");
        if (codA != null && !codA.isEmpty()) {
            key.setCodA(new java.lang.Long(codA.get(0)));
        }
        java.util.List<String> grupo = map.get("grupo");
        if (grupo != null && !grupo.isEmpty()) {
            key.setGrupo(new java.lang.Short(grupo.get(0)));
        }
        return key;
    }

    public InscribeFacadeREST() {
        super(Inscribe.class);
        this.em =(EntityManager) Persistence.createEntityManagerFactory("reportesAppTomPU").createEntityManager();
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Inscribe entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Inscribe entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        Entidades.InscribePK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Inscribe find(@PathParam("id") PathSegment id) {
        Entidades.InscribePK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Inscribe> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Inscribe> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
