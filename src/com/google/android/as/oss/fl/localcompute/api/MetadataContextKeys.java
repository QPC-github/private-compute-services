/*
 * Copyright 2021 Google LLC
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

package com.google.android.as.oss.fl.localcompute.api;

import android.os.ParcelFileDescriptor;
import io.grpc.Context;
import io.grpc.Metadata;
import io.grpc.binder.ParcelableUtils;

/** The Context/Metadata keys for wrapping Parcelables in gRPC service/client. */
public final class MetadataContextKeys {

  public static final Metadata.Key<ParcelFileDescriptor> FILE_DESCRIPTOR_METADATA_KEY =
      ParcelableUtils.metadataKey("FileDescriptor-bin", ParcelFileDescriptor.CREATOR);

  public static final Context.Key<ParcelFileDescriptor> FILE_DESCRIPTOR_CONTEXT_KEY =
      Context.key("FileDescriptor-bin");

  private MetadataContextKeys() {}
}
