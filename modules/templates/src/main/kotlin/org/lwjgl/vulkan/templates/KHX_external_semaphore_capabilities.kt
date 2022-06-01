/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHX_external_semaphore_capabilities = "KHXExternalSemaphoreCapabilities".nativeClassVK("KHX_external_semaphore_capabilities", type = "instance", postfix = KHX) {
    documentation =
        """
        An application may wish to reference device semaphores in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension provides a set of capability queries and handle definitions that allow an application to determine what types of "{@code external}" semaphore handles an implementation supports for a given set of use cases.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHX_external_semaphore_capabilities</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>77</dd>

            <dt><b>Status</b></dt>
            <dd>Draft</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-20</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires VK_KHR_get_physical_device_properties2.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jesse Hall, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Jeff Juliano, NVIDIA</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd>James Jones (jajones 'at' nvidia.com)</dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHX_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHX_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME".."VK_KHX_external_semaphore_capabilities"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHX".."1000076000",
        "STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHX".."1000076001"
    )

    EnumConstant(
        "VK_LUID_SIZE_KHX",

        "LUID_SIZE_KHX".."8"
    )

    EnumConstant(
        """
        VkExternalSemaphoreHandleTypeFlagBitsKHX - Bitmask of valid external semaphore handle types

        <h5>Description</h5>
        For more information, see:

        <ul>
            <li>The reference page for ##VkPhysicalDeviceExternalSemaphoreInfoKHX, where this interface is defined.</li>
            <li>The See Also section for other reference pages using this type.</li>
            <li>The Vulkan Specification.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkExternalSemaphoreHandleTypeFlagsKHX}, ##VkImportSemaphoreFdInfoKHX, ##VkPhysicalDeviceExternalSemaphoreInfoKHX, #GetSemaphoreFdKHX(), #GetSemaphoreWin32HandleKHX()
        """,

        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHX".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX".enum(0x00000002),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX".enum(0x00000004),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHX".enum(0x00000008),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHX".enum(0x00000010)
    )

    EnumConstant(
        """
        VkExternalSemaphoreFeatureFlagBitsKHX - Bitfield describing features of an external semaphore handle type

        <h5>Description</h5>
        For more information, see:

        <ul>
            <li>The See Also section for other reference pages using this type.</li>
            <li>The Vulkan Specification.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkExternalSemaphoreFeatureFlagsKHX}
        """,

        "EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHX".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHX".enum(0x00000002)
    )

    void(
        "GetPhysicalDeviceExternalSemaphorePropertiesKHX",
        """
        Function for querying external semaphore handle capabilities.

        <h5>C Specification</h5>
        Semaphores <b>may</b> support import and export of external semaphore handles. To query the external handle types supported by semaphores, call:

        <code><pre>
￿void vkGetPhysicalDeviceExternalSemaphorePropertiesKHX(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceExternalSemaphoreInfoKHX* pExternalSemaphoreInfo,
￿    VkExternalSemaphorePropertiesKHX*           pExternalSemaphoreProperties);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pExternalSemaphoreInfo} <b>must</b> be a pointer to a valid ##VkPhysicalDeviceExternalSemaphoreInfoKHX structure</li>
            <li>{@code pExternalSemaphoreProperties} <b>must</b> be a pointer to a ##VkExternalSemaphorePropertiesKHX structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExternalSemaphorePropertiesKHX, ##VkPhysicalDeviceExternalSemaphoreInfoKHX
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the semaphore capabilities."),
        const..VkPhysicalDeviceExternalSemaphoreInfoKHX.p.IN("pExternalSemaphoreInfo", "points to an instance of the ##VkPhysicalDeviceExternalSemaphoreInfoKHX structure, describing the parameters that would be consumed by #CreateSemaphore()."),
        VkExternalSemaphorePropertiesKHX.p.OUT("pExternalSemaphoreProperties", "points to an instance of the ##VkExternalSemaphorePropertiesKHX structure in which capabilities are returned.")
    )
}