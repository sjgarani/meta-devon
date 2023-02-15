SUMMARY = "Simple erlang application to answer cluster health checks"
DESCRIPTION = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=77d0ca716ce9311d0628483ea1dec474"

S = "${WORKDIR}/git"
SRCREV = "7630c5025dc0fc95937593e218a996634f81d1ae"
PV = "0.1.0-git${SRCPV}"
PR = "r0"
SRC_URI = "\
    git://github.com/sjgarani/devon;branch=main;protocol=git \
    "

inherit rebar3

REBAR3_PROFILE = "prod"