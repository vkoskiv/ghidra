/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.app.plugin.core.debug.gui.modules;

import java.awt.Component;
import java.util.Set;

import docking.ComponentProvider;
import docking.DefaultActionContext;
import ghidra.trace.model.modules.TraceModule;

public class DebuggerModuleActionContext extends DefaultActionContext {
	private final Set<TraceModule> selectedModules;
	private final boolean forcedSingle;

	public DebuggerModuleActionContext(ComponentProvider provider, Set<TraceModule> selected,
			Component sourceComponent, boolean forcedSingle) {
		super(provider, selected, sourceComponent);
		this.selectedModules = selected;
		this.forcedSingle = forcedSingle;
	}

	public Set<TraceModule> getSelectedModules() {
		return selectedModules;
	}

	public boolean isForcedSingle() {
		return forcedSingle;
	}
}
