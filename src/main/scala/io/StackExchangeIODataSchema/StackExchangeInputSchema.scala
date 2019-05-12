package io.StackExchangeIODataSchema

object StackExchangeInputSchema {

  case class BadgeData(UserId: Long,
                       Name: String,
                       Date: String)

  case class CommentsData(UserId: Long,
                          UserDisplayName: String,
                          PostId: Long,
                          Text: String,
                          Score: Long,
                          CreationDate: String)

  case class PostHistoryData(
                          PostHistoryTypeId:Long,
                          Id: Long,
                          RevisionGUID: String,
                          CreationDate: String,
                          UserId: Long,
                          UserDisplayName: String,
                          Comment: Option[String],
                          Text: String,
                          PostId: Long,
                          VALUE: String,
                          CloseReasonId: Option[String]
                        )

  case class PostLinksData(
                            CreationDate: String,
                            Id: Long,
                            LinkTypeId: Long,
                            PostId: Long,
                            RelatedPostId: Long,
                            VALUE: String
                            )

}
