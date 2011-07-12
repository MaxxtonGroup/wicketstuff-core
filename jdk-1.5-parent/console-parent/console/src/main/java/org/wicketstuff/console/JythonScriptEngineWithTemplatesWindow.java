/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wicketstuff.console;

import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.IModel;
import org.wicketstuff.console.engine.Lang;
import org.wicketstuff.console.templates.ScriptTemplate;

/**
 * A {@link ModalWindow} displaying a {@link JythonScriptEngineWithTemplatesPanel}.
 * 
 * @author cretzel
 */
public class JythonScriptEngineWithTemplatesWindow extends ScriptEngineWithTemplatesWindow
{

	private static final long serialVersionUID = 1L;

	/**
	 * @see ScriptEngineWithTemplatesWindow#ScriptEngineWithTemplatesWindow(String, Lang,
	 *      org.apache.wicket.model.IModel)
	 */
	public JythonScriptEngineWithTemplatesWindow(final String id, final IModel<String> windowTitle,
		final IDataProvider<ScriptTemplate> dataProvider)
	{
		super(id, Lang.JYTHON, windowTitle, dataProvider);
	}

}
