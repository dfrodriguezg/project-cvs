/*
 * Copyright 2005-2016 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package cvs.cvs.transformaciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.camel.Exchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cvs.cvs.model.RelacionCVS;

@Component("transformationComponent")
public class TransformationComponent {

	private Map<String, String> mapRelacionCVS;
	private List<RelacionCVS> listRelacion;

	@Autowired
	private RelacionCVS relacionCVS;

	@PostConstruct
	public void init() {
		listRelacion = new ArrayList<>();
		mapRelacionCVS = new HashMap<>();
	}

	public Map<String,String> transformation(Exchange exchange) {

		relacionCVS = (RelacionCVS) exchange.getIn().getBody();
		mapRelacionCVS.put("NumReferenciaTransaccion", relacionCVS.getNumreferenciatransaccion());
		mapRelacionCVS.put("NumTransaccion", relacionCVS.getNumtransaccion());
		mapRelacionCVS.put("Estado", relacionCVS.getEstado());
		mapRelacionCVS.put("NombreCliente", relacionCVS.getNombrecliente());
		//exchange.getOut().setBody(mapRelacionCVS);
		return mapRelacionCVS;
	}
}
