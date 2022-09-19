import io.kubernetes.client.openapi.Configuration
import io.kubernetes.client.openapi.apis.CoreV1Api
import io.kubernetes.client.openapi.models.{V1Pod, V1PodList}
import io.kubernetes.client.util.Config

import java.util

object Main extends App {
  val client = Config.defaultClient()
  val _ = Configuration.setDefaultApiClient(client)

  val api = new CoreV1Api()
  val podList: V1PodList = api.listPodForAllNamespaces(null, null, null, null,
    null, null, null, null, null, null)
  val list: util.List[V1Pod] = podList.getItems()
  list.forEach(x => println(x.getMetadata().getName()))

  println("Hello, k8s!")
}
