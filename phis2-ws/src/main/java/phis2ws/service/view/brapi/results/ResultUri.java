//**********************************************************************************************
//                                       ResultatUri.java 
//
// Author(s): Eloan LAGIER
// PHIS-SILEX version 1.0
// Copyright © - INRA - 2018
// Creation date: Feb 26 2018
// Contact: eloan.lagier@inra.fr, morgane.vidal@inra.fr, anne.tireau@inra.fr, pascal.neveu@inra.fr
// Last modification date:  Feb 26, 2018
// Subject: extend form Resultat adapted to Uri
//***********************************************************************************************
package phis2ws.service.view.brapi.results;

import java.util.ArrayList;
import phis2ws.service.view.brapi.Pagination;
import phis2ws.service.view.manager.Resultat;
import phis2ws.service.view.model.phis.Uri;

/**
 * A class which represents the result part in the response form, adapted to the URIs
 * @author Eloan LAGIER
 */
public class ResultUri extends Resultat<Uri> {
    /**
     * Builder for a one-element list
     *
     * @param uris
     */
    public ResultUri(ArrayList<Uri> uris) {
        super(uris);
    }

    /**
     * builder for a more-than-one element list
     *
     * @param uris
     * @param pagination
     * @param paginate
     */
    public ResultUri(ArrayList<Uri> uris, Pagination pagination, boolean paginate) {
        super(uris, pagination, paginate);
    }
}
