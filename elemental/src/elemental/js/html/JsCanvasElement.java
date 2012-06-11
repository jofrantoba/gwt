/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package elemental.js.html;
import elemental.js.dom.JsElement;
import elemental.dom.Element;
import elemental.html.CanvasRenderingContext;
import elemental.html.CanvasElement;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;

import elemental.events.*;
import elemental.util.*;
import elemental.dom.*;
import elemental.html.*;
import elemental.css.*;
import elemental.js.stylesheets.*;
import elemental.js.events.*;
import elemental.js.util.*;
import elemental.js.dom.*;
import elemental.js.html.*;
import elemental.js.css.*;
import elemental.js.stylesheets.*;

import java.util.Date;

public class JsCanvasElement extends JsElement  implements CanvasElement {
  protected JsCanvasElement() {}

  public final native int getHeight() /*-{
    return this.height;
  }-*/;

  public final native void setHeight(int param_height) /*-{
    this.height = param_height;
  }-*/;

  public final native int getWidth() /*-{
    return this.width;
  }-*/;

  public final native void setWidth(int param_width) /*-{
    this.width = param_width;
  }-*/;

  public final native JsCanvasRenderingContext getContext(String contextId) /*-{
    return this.getContext(contextId);
  }-*/;

  public final native String toDataURL(String type) /*-{
    return this.toDataURL(type);
  }-*/;
}