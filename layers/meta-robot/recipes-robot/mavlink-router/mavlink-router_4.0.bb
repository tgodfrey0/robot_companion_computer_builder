SUMMARY = "MAVLink Router"
DESCRIPTION = "Routes MAVLink messages between UART, UDP, and TCP endpoints"
HOMEPAGE = "https://github.com/mavlink-router/mavlink-router"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=93888867ace35ffec2c845ea90b2e16b"

SRC_URI = "gitsm://github.com/mavlink-router/mavlink-router.git;protocol=https;branch=master"
SRCREV = "42529d55b665e0a9a29e424e186f514c56c2e5b5"
S = "${WORKDIR}/git"

DEPENDS = "systemd"

inherit meson pkgconfig

FILES:${PN} += "${systemd_system_unitdir}/mavlink-router.service"
