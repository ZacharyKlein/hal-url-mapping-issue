package urlmappingtest

class UrlMappings {

    static mappings = {

        "/api/v1/clients/$client/sessions/$session"(controller: 'disclosureSession', action: 'show')
    }
}
