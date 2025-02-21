/*
 * Copyright 2011 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jayway.jsonpath;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public interface ParseContext {

    ReadContext parse(String json);

    ReadContext parse(Object json);

    ReadContext parse(InputStream json);

    ReadContext parse(InputStream json, String charset);

    ReadContext parse(File json) throws IOException;

    ReadContext parse(URL json) throws IOException;
}
